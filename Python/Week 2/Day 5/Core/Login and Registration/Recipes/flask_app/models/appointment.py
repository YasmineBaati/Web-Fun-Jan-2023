from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash
from flask_app.models import user

class Appointment:
    def __init__(self,data):
        self.id = data['id']
        self.task = data['task']
        self.date = data['date']
        self.status = data['status']
        self.user_id = data['users_id']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    @classmethod
    def create_oppoint(cls,data):
        query= """INSERT INTO appointments (task , date, status , users_id ) 
        VALUES (%(task)s,%(date)s,%(status)s,%(user_id)s);
        """
        result=connectToMySQL(DATABASE).query_db(query,data)
        print(result)
        return result
    
    @classmethod
    def get_all(cls):
        query=""" SELECT * FROM appointments;
        """
        results =  connectToMySQL(DATABASE).query_db(query)
        all_rec=[]
        for row in results:
            all_rec.append(cls(row))
        return all_rec
    @classmethod
    def get_by_id(cls,data):
            query=""" SELECT * FROM appointments WHERE id =%(id)s
            """
            result = connectToMySQL(DATABASE).query_db(query,data)
            if (result):
                return cls(result[0])
    @classmethod
    def edit_oppoint(cls,data):
        query="""UPDATE appointments
                SET task=%(task)s,date=%(date)s,status=%(status)s WHERE id = %(id)s;
        """
        return  connectToMySQL(DATABASE).query_db(query,data)
    @classmethod
    def remove(cls,data):
        query="""DELETE FROM appointments WHERE id=%(id)s
        """
        return  connectToMySQL(DATABASE).query_db(query,data)


    # * validation
    @staticmethod
    def validate(data):
        is_valid=True
        if len(data['task'])<3:
            flash("Invalid  task!")
            is_valid=False
        if len(data['date'])<3:
            flash("Invalid date!")
            is_valid=False

        return is_valid


