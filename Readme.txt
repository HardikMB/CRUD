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
2. incorporate data validation. You can do that in a service class
3. Add global exception handler for spring bot controller
4. add additional APIS-
    a. search the region by region name
    b. search the region whose name contains the given string
    c. search the branch by pincode
    d. search the branch by city
    e. search the branch by state
    f. search the branch whose address contains given string
    g. apply sorthing to the findAll() APIs.
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



