### Online shop
# SHOP 059
## INTRODUCTION
- In this project we make an online shop like Digikala and Amazon.
- we have 3 different accounts : Admin, User and Seller with different accessibility.
- also classes for Product(super class) and Book, Bag, Cloth, Headphones, Mobile, Painting, Rug, Shoes, SportEquipment, Toy and Watch 
- which are subclasses of Product.
- I wrote some test case that you can enter with them : user(firstuser and pass1234) - seller(Goody, 1212pass) - admin(mainAdmin, 1973admin)
- You can go to different menus with them.

--------------

use UMLDiagram: 
![Screenshot 2023-04-07 at 23-34-22 UML Class Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-07%20at%2023-34-22%20UML%20Class%20Diagram%20--%20SmartDraw.png)

![Screenshot 2023-04-07 at 23-37-09 UML Class Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-07%20at%2023-37-09%20UML%20Class%20Diagram%20--%20SmartDraw.png)

![Screenshot 2023-04-07 at 23-40-10 UML Class Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-07%20at%2023-40-10%20UML%20Class%20Diagram%20--%20SmartDraw.png)


- I made attributes of shop final, cause i don't want them to change.
- when user wants to finalize their shopping cart the program first check the total price of order and if it was more than the user wallet then they will get an error and can't do it.
- I put ID an attributes of product and thats the way they will be uniqe.
- I used file for a connection between admins and user/seller.
- and it worked they way that when we need an admin confirmation we write to the file that we maked before and when an admin come login into the program they can see the requests and confirm them and then a user or seller can continue their job
- the request are like get an authorization for a seller, get confirmation for an order and adding fund to their wallet.

## problems I had and how I fixed them
- first I had problem in making a new repository in gitub :)
- I made attributes of class Admin protected so I can use them in class User.
- I wrote Arraylist of all products >> Object, so I can put different objects of different classes in it.
- I made new objects static and in class "main" so I can use them in different scopes.

# Bonus Tasks
- I used regex for password , email address and phone number so invalid ones can't add to user and admin pages.
- used HashMap to find objects by their username/company name. 
- and wrote 3 HashMaps for each class user, admin and seller.
- 