# CreditAppPralat

Steps to Setup
1. Clone the application

git clone https://github.com/JakubPralat/CreditAppPralat.git
cd CreditAppPralat

2. Run the app

docker-compose up

It can take a few minutes to start. 

 When the app starts you can get a list od credits on http://localhost:8080/credit (HTTP GET). You can add a new credit by sending POST request to http://localhost:8080/credit/create with JSON body:
{
"creditName":"Pozyczka",
"firstName":"Adam",
"surname":"Malysz",
"pesel":"12345699999",
"productName":"Narty",
"value":1999
}

If you have any questions, please contact me.