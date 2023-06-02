from flask_app import app
from flask import request ,render_template, session, redirect, flash
from flask_app.models.user import User
from flask_app.models.appointment import Appointment


@app.route('/appointments/new')
def new_oppoint():
    if not 'user_id' in session:
        return redirect('/')
    return render_template('new_opp.html')

@app.route('/appointments/create', methods=['POST'])
def create_oppoint():
    if (Appointment.validate(request.form)):
        data ={
            **request.form,
            'user_id':session['user_id']
        }
        print(data)
        Appointment.create_oppoint(data)
        return redirect('/dashboard')
    return redirect('/appointments/new')

@app.route('/appointments/<int:user_id>')
def show(user_id):
    my_opp = Appointment.get_by_id({'id':user_id})
    user = User.get_by_id({'id':session['user_id']})
    return render_template('show.html',my_opp=my_opp,user=user)

@app.route('/appointments/<int:opp_id>/edit')
def edit(opp_id):
    if not 'user_id' in session:
        return redirect('/')
    my_opp=Appointment.get_by_id({'id':opp_id})
    return render_template('edit.html',my_opp=my_opp)

@app.route('/appointments/<int:opp_id>/update', methods=['POST'])
def update(opp_id):
    if(Appointment.validate(request.form)):
        Appointment.edit_oppoint(request.form)
        return redirect('/dashboard')
    return redirect('/appointments/'+str(opp_id)+'/edit')


@app.route('/appointments/<int:opp_id>/destroy')
def destroy(opp_id):
    Appointment.remove({'id':opp_id})
    return redirect('/dashboard')
