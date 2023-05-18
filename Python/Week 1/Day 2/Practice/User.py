class User:
    def __init__(self,first_name,last_name,email,age):
        #attributes
        self.first_name=first_name
        self.last_name=last_name
        self.email=email
        self.age=age
        #default attributes
        self.is_rewards_member=False
        self.gold_card_points = 0
        #methods:
    def display_info(self):
        print(f"First Name:{self.first_name}")
        print(f"Last Name:{self.last_name}")
        print(f"Email:{self.email}")
        print(f"Age:{self.age}")
        print(f"Member Status:{self.is_rewards_member}")
        print(f"Points:{self.gold_card_points}")
    def enroll(self):
        self.is_rewards_member=True
        self.gold_card_points = 200
    def spend_points(self, amount):
        self.gold_card_points -= amount
#User1:
User1=User("Yasmine","Baati","yasminebaati321@gmail.com",22)
User1.display_info()
User1.enroll()
User1.spend_points(50)
#User2:
User2=User("Nicolas","Youssef","nicolasyoussef169@gmail.com",38)
User2.display_info()
User2.enroll()
User2.spend_points(80)
#User3:
User3=User("Mouna","Makhlouf","mounamakhlouf306@gmail.com",14)
User3.display_info()
User3.enroll()
User3.spend_points(40)