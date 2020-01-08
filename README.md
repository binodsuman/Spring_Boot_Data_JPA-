# Spring_Boot_Data_JPA-
Spring Boot With Spring Data JPA 

How to Run:
1. Postgres database must be there in your laptop.
2. Postgres user name either you can change in code. (I have used postgres/binod)
3. Run Application.java as Java Application.
4. Use Postman to get and post data.
5. POST http://localhost:8080/hr/add
  In Body choose JSON content type and use this below format:
  {
       
        "name": "Bill Gate",
        "age": 52
    }
    
 6. You notice in your databse one table created employee and one record also.
 7. GET http://localhost:8080/hr/all to fetch all data.
     [
      {
          "id": 6,
          "name": "Bill Gate",
          "age": 52
      },
      {
          "id": 7,
          "name": "Binod Suman",
          "age": 32
      }
   ]
 8. GET http://localhost:8080/hr/7 to fetch single record  
    {
    "id": 7,
    "name": "Binod Suman",
    "age": 32
   }
 
