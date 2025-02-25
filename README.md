Description: 
Conseptof the Project is a Design Company's introduction and ShowCase. 
Site has atwo part one part is Main Page and other is Contact InformationPage. 
Both parts of links are contains 3 chapter Header ,Body, Footer. 
Elements ; 
Home:ThisPart contains Drop Downelements don't goesany link but they have hash tag. 
About Us:This partgoesaMain Page and Itcontainsintroductinabout company. 
Services: When Clicked it goes a form in MainPage and This button contains DropDown. 
Dropdown elements connected with database in this part firstly you site opens with guest so you can not see the products when you login or signup services part will open and you can see the products 
Contact: When you click you'll direct to Contact Page. 
Sign in (User Information):Connected with database and database have control code to check users name if already user have same name it gives error. 
Body: 
There are three parts in Main Page; 
Home Part: This part contains autophoto slayt and animationed heading.(Writenwith .jss). 
About UsPart: This part gives information about company and there is a continue button to get more introduction this button written with css and js action elemnts. 
Join Us Part:This part have form part when you fil lall the blanks Visitor part where inthe top-right of site itchanges to your name.Connected with database takes the user info end sends to database. 
Login Part : If you already create an account you can reach there to only clicking to Clik me part where in the under the form part. This part also connected with database and if name and pass Word true you can reach the products. 
Footer: 
Shows Licences; designed with css. 
Contact Page: 
This page you will direct to when you click to Contact part where in header part. 
 	There isa table class.Itcontainscontact details(fax,mail,phone,adress and maps). 
 
To reach Services part there is a js code the code takes “Visitor” tag if Visitor did’nt register or log in it sends to login form after then when you click you will send to Product’s page . 
 
Product Page 
 
  
 
 
 
 
 
BODY PART 
In body part there is a register part .When form filled correctly and submit button action happen database connection will be active and part by part items equaling with tags.After then checking name in database and trying to find if there and same name in database giving alert and empty the name box  
 
 if you have account you can click “Already have account?” and log in part will open between the register part and takes name and password . 
 
 
 
 
 
Server & Connection 
This Node.js application sets up an Express server integrated with MongoDB to handle user registration, login, and standard CRUD operations on user data. 
Dependencies: 
•	express: Used to construct the server and handle HTTP requests. 
•	mongoose: Provides MongoDB object modeling for Node.js applications. 
•	body-parser: Middleware for parsing request bodies. 
•	path: Utility module for managing file paths. 
Setting up MongoDB: 
The server connects to a MongoDB database using Mongoose. Ensure that MongoDB is installed and running locally on the default port (27017). If needed, modify the database URL in the mongoose.connect() method. 
 
Express Middleware: 
body-parser: Parses JSON request bodies.  
Endpoints: 
1.	GET /users: Retrieves all users from the database. 
2.	POST /users: Allows the addition of a new user to the database. 
3.	POST /login: Authenticates a user with their name and password. 
4.	GET /users/check/: Checks the availability of a username. 
 
PUT /users/ 
: Updates user data based on ID.  
DELETE /users/ 
: Deletes a user based on ID. 
Error Handling: 
•	Proper use of try-catch blocks for error handling during database operations. 
Static Files: 
The express.static() middleware serves static files (such as HTML, CSS, and client-side JavaScript) from the public directory. 
Server Start: 
•	Port 3000 is opened for listening. Server start is confirmed by a console log. 
 
Admin Panel 
In admin panel there are many functions all connected with data base when new person registered shows in block and you can modify how u want only admins can Access to the panel and admins have red named tittle in server.js there is a delete user code. 
  
 
 
