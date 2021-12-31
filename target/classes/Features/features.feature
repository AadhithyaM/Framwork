Feature: verifying Adactinghotel page details
Scenario Outline: verifying adacting hotel cancel
Given user is on the adactinhome page
When user should enter "<username>"and "<password>"
And user should click login button
And user search the hotel"<Location>""<Hotels>""<Roomtype>""<Noofrooms>""<CheckInDate>""<CheckOutDate>""<adultsperroom>"and"<Childperoom>"
And user should click search button
And user should select the hotel
And user should book the hotel"<Firstname>""<Lastname>""<Address>""<ccnumber>""<cctype>""<ccexpmonth>""<ccexpyear>"and"<cccvv>"
And user should click book now
And user should cancel the booking
Then user should verify error msg


Examples: 
|username|password|Location|Hotels|Roomtype|Noofrooms|CheckInDate|CheckOutDate|adultsperroom|Childperoom|Firstname|Lastname|Address|ccnumber|cctype|ccexpmonth|ccexpyear|cccvv|
|Aadhithya|Aadhi@143|London|Hotel Creek|Double|1 -One|28/12/2021|29/12/2021|1 -One|1 -One|Aadhi|nishi|chennai|1234587891234567|Other|April|2021|1234|
