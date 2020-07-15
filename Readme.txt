1. During startup sample data is automatically inserted into h2 db(via data.sql)

2. Application URL. context is currently empty. So sample URL to fetch all branches would be as below
http://localhost:8080/branch

3. To save a branch with refernce to existing region, use following sample request object

{

                "branchCode": "SB000011",
                "address1": "Akurdi",
                "address2": null,
                "branchCity": "Pune",
                "branchState": "Maharashtra",
                "pinCode": "411035",
                "iFSCcode": "SBIN000011",
                "region": {
                            "regionId": 1
                          }
}

This will insert new branch under Region-1.

Further tasks:
1. I want to have  a context path in the application as /crudApp
http://localhost:8080/crudApp/branch
Solution1: The context path is set from application.properties file using the property name as "server.servlet.context-path".
Solution2: The context path is set via Main method using System.setProperty function where  "server.servlet.context-path" parameter is set to the context path.

2. incorporate data validation. You can do that in a service class
Data validations are applied using the package javax.validations.contraints.*

3. Add global exception handler for spring boot controller
Global exception handler is added in com.springops.crud package using @ControllerAdvice
Implemented a method to send a proper response back to browser so application does not catch

4. add additional APIS-
    a. search the region by region name - done
    b. search the region whose name contains the given string  - done
    c. search the branch by pincode  - done
    d. search the branch by city - done
    e. search the branch by state - done
    f. search the branch whose address contains given string - done
    g. apply sorting to the findAll() APIs.
       You can modify existing API or crate new APIS to retrive data in sorted order.
       Sorting for region should happen based on region name and branch-name for branch.
    h. for any individual record , construct a reference URL to itself

      e.g.    {
                   "regionId": 2,
                   "regionName": "Ravet",
                   "branch": []
               }

               above is a sample region record. now the record should be as follow:

                  {
                       "regionId": 2,
                       "regionName": "Ravet",
                       "branch": [],
                       "reference": "http://localhost:8080/crudApp/region/2"
                   }
                the additional attribute to be generated dynamically for each individual region and branch


blood group unique A,B,AB,O + AND -VE 
