Insert into REGIONS (REGION_ID,REGION_NAME) values (1,'India');
Insert into REGIONS (REGION_ID,REGION_NAME) values (2,'Ravet');
Insert into REGIONS (REGION_ID,REGION_NAME) values (3,'Ahmedabad');
Insert into REGIONS (REGION_ID,REGION_NAME) values (4,'Canada');
Insert into REGIONS (REGION_ID,REGION_NAME) values (5,'America');
Insert into REGIONS (REGION_ID,REGION_NAME) values (9,'Pune');
Insert into REGIONS (REGION_ID,REGION_NAME) values (7,'Sanewadi');
Insert into REGIONS (REGION_ID,REGION_NAME) values (8,'India');
Insert into REGIONS (REGION_ID,REGION_NAME) values (155,'Sanewadi');
Insert into REGIONS (REGION_ID,REGION_NAME) values (10,'Jabalpur');


Insert into BRANCH_MASTER (BRANCH_ID,BRANCH_CODE,ADDRESS1,ADDRESS2,BRANCH_CITY,BRANCH_STATE,PIN_CODE,IFSC_CODE,REGION_ID) values (1,'SB00001','Maninagar Station Road',null,'Ahmedabad','Gujarat','380050','SBIN00001',3);
Insert into BRANCH_MASTER (BRANCH_ID,BRANCH_CODE,ADDRESS1,ADDRESS2,BRANCH_CITY,BRANCH_STATE,PIN_CODE,IFSC_CODE,REGION_ID) values (2,'SB00002','Bhandarkar Road',null,'Pune','Maharashtra','411007','SBIN00002',9);
Insert into BRANCH_MASTER (BRANCH_ID,BRANCH_CODE,ADDRESS1,ADDRESS2,BRANCH_CITY,BRANCH_STATE,PIN_CODE,IFSC_CODE,REGION_ID) values (3,'SB00003','Shaktinagar','MPEB Colony','Jabalpur','Madhya Pradesh','482001','SBIN00105',10);
Insert into BRANCH_MASTER (BRANCH_ID,BRANCH_CODE,ADDRESS1,ADDRESS2,BRANCH_CITY,BRANCH_STATE,PIN_CODE,IFSC_CODE,REGION_ID) values (4,'SB00002','Aundh',null,'Pune','Maharashtra','411007','SBIN00002',9);
Insert into BRANCH_MASTER (BRANCH_ID,BRANCH_CODE,ADDRESS1,ADDRESS2,BRANCH_CITY,BRANCH_STATE,PIN_CODE,IFSC_CODE,REGION_ID) values (5,'SB00003','Akurdi',null,'Pune','Maharashtra','411035','SBIN00003',9);
Insert into BRANCH_MASTER (BRANCH_ID,BRANCH_CODE,ADDRESS1,ADDRESS2,BRANCH_CITY,BRANCH_STATE,PIN_CODE,IFSC_CODE,REGION_ID) values (6,'SB00003','Akurdi',null,'Pune','Maharashtra','411035','SBIN00003',9);
commit;