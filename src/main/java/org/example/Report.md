# Online Shop (Nowruz Project)

## INTRODUCTION
- In this project we make an online shop like Amazon and Digikala which name is *Shop 059*
- we have 3 different accounts : Admin, User and Seller with different accessibility.
- also classes for Product(super class) and Book, Bag, Cloth, Headphones, Mobile, Painting, Rug, Shoes, SportEquipment, Toy and Watch which are subclasses of Product.
- I wrote some test case that you can use them to enter the program and go into different menus: user(firstuser and pass1234) and (heli, heli7496) - seller(Goody, 1212pass) - admin(mainAdmin, 1973admin).
- There is a part which I explain about different menus in the report(**Menus**)


-----------------
- I put ID an attributes of product and thats the way they will be unique.
- Each ID has 3 or 4 number, the first number represent the category(we have 11 categories and that's why some IDs are about 4 numbers), the second number is for the seller number(for example : *Goody* >> 1), and the third number is number of a product(for example if it's *2* that means this is the second product of this category).
- I used file for a connection between admins and user/seller.It worked the way that when we need a confirmation from an admin we write that requests to the file, and when an admin login into the program they have an option to see the requests and confirm them. Then a user or seller can continue what they wanted to do.
- Our request are get an authorization for a seller, get confirmation for an order and adding fund to their wallet etc.
- I made attributes of shop final, cause i don't want them to change.

----------------

## menus
> mainMenu()
- in the main menu I add the objects I made to their related Arraylist.
- There is 4 way to enter the program, you can be a user, a seller, an admin or you can make your own account which also can be a seller account or a user one.(admins can only be added by another admin)
- If you have account you will enter the asked information(username/company name and password), it will be checked with login method in class *Shop* and if they are correct you can go to each menu.
- and If you don't have any account you will enter the needed information, Your account will be created and then you can continue.
- For choosing a username/company name you will receive an error if they are taken before. 
 

> userMenu()
- as a user there are different things  that you can do
- search a product entering a name or see all the products in each category
- view your shopping cart and the products that are in it and after that you can remove any one you wish and also you can finalize your shopping cart.(before making a request the total amount of your shopping cart is compared to your wallet and if it's more than what you have in your wallet you can not finalize your shopping cart).
- to finalize you shopping cart I used file and in that file your request will be added and will be confirmed if an admin do it and after sending your request, you can see you order situation in another part(*7.view the situation of your order*)
- you can add fund to your wallet with a request like making a request for finalize your shopping cart.
- you can also see your past orders and your purchased products.
- as a user you also have the accessibility to edit your personal information like username, password, phone number and email address).
- and you can also see the details of the shop like name, support phone number and email.


> sellerMenu()
- As a seller you can add a new product by adding needed information for each category.
- view list of your available product in your account.
- and you can also the amount of money you have in your wallet.

> adminMenu()
- And as an admin you can add new admins by enter asked information.
- you can view users' information.
- and you can see requests that users and sellers made and then you can confirm them.
- after admin choose to confirm the requests, the requests in file will be deleted.


## UMl diagrams
![Screenshot 2023-04-08 at 18-12-21 Uml_Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-08%20at%2018-12-21%20Uml_Diagram%20--%20SmartDraw.png)

![Screenshot 2023-04-07 at 23-40-10 UML Class Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-07%20at%2023-40-10%20UML%20Class%20Diagram%20--%20SmartDraw.png)

![Screenshot 2023-04-08 at 18-28-31 UML Class Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-08%20at%2018-28-31%20UML%20Class%20Diagram%20--%20SmartDraw.png)

![Screenshot 2023-04-08 at 18-33-04 UML Class Diagram -- SmartDraw.png](..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2FScreenshot%202023-04-08%20at%2018-33-04%20UML%20Class%20Diagram%20--%20SmartDraw.png)

## I had some problems and that's how I fixed them

- I made attributes of class Admin protected so I can use them in class User.
- I wrote Arraylist of all products and Arraylist of all products with Object, so I can put different objects of different classes in it.
- I made new objects static and in class "main" so I can use them in different scopes without problem.

## Extra parts
- I used regex for 3 part of the program and made 3 different regex for each of them (password , email address and phone number). And if a user/admin/seller enter an invalid String they will get and error and a message about why it is wrong.
- I used HashMap to find objects with a String (for user and admin it's their username and for seller it's their company name), So I wrote 3 HashMaps for each class user, admin and seller.
