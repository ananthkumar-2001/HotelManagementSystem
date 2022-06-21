The introducing software, Hotel Management System which is going to be implemented for Hotel will automate the major operations of the hotel. The Reservation System is to keep track in room and hall reservation and check availability. The Room Management System is for manage all room types room services. The Inventory Control System will keep track in all inventories of the hotel and guest details will handled by guest management. Administration department will monitor the all  .There is three End Users for HMS. The End Users are Owner, Manager and Receptionist. Owner can access to all system functionalities without any restrictions. Manager can access to all system functionalities with limited restrictions. Receptionist can only access to the Reservation management section. To keep restrictions for each End User levels HMS can create different Login functions.

The objectives of the automated Hotel Management System is to simplify the day to day processes of the hotel. The system will be able to handle many services to take care of all customers in a quick manner. As a solution to the large amount of file handling happening at the hotel, this software will be used to overcome those drawbacks. Safety, easiness of using and most importantly the efficiency of information retrieval are some benefits the development team going to present with this system. The system should be user appropriate, easy to use, provide easy recovery of errors and have an overall end user high subjective satisfaction. 

1.1	Product Functions
•	Make Reservations
•	Search Rooms
•	Add Payment
•	Issue Bills
•	Manage Guest (Add, Update Guest)
•	Manage Room Details (Add, Update, Delete)
•	Manage Staff (Add, Update, Delete, View)
•	Manage Inventory (Add, Edit, Delete)
•	Set Rates
•	Retrieve Reports (Staff payment, Income)
•	Manage Users (Add, Update, Delete)
•	E-mail notifications                   

	        
Functional Requirements

Function 1	Make Reservations

Input	Code, Number of children, Number of adults, check-in date, check out date, status, Number of nights
Output	Database Record, Database successfully updated message
Processing	Validate the given details and record the information in to the database.


Function 2	Add Guest

Input	Member code, Phone number, Company, Name, E-mail, Gender, Address
Output	Database Record, Database successfully updated message
Processing	Validate the given details and record the information in to the database.


Function 3	Add staff member

Input	Code, Employee Name, Employee Address, NIC, Salary, Name Age, Occupation, E-mail
Output	Database Record, Database successfully updated message
Processing	Validate the given details and record the information in to the database.


Function 4	Search Rooms

Input	Period, Check-in, Check-out, Guest
Output	Display a message with available room details
Processing	Validate the given details and check for the available rooms in a given time period and return it’s availability. 


Function 5	Add Payments

Input	Total, pay time, Credit card  details
Output	Database Record, Database successfully updated message
Processing	Validate the given details and record the information in to the database.


Function 6	Issue Bill
Input	Billing no, Quantity, Price, Taxes, Date, Services, Unit
Output	Printed version of the bill
Processing	Validate the given details and total cost is calculated according to the 
Services gain by the customer.


Function 7	Set Rates

Input	Check-in, Check-out, Day, No.of guests, First night price, Extension price 
Output	Database Record, Database successfully updated message
Processing	Validate the given details and record the information in to the database.


