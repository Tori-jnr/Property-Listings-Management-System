// Concept Note
// 192789 Shali
//200159  Juliet
//175852 Kimberly
//163034  Alvaros
//189600 Elizabeth



fun main() {

    println("\n---------------------------------------------------")
    println("Welcome to our Property Listings Management System")
    println("-----------------------------------------------------\n")

// Landlord Details

    println("Landlord info: \n")
    val landlordName: String = "Linda Chelagat"
    val landlordId = 201
    val landlordPhoneNo = "0767904538"
    val landlordEmail = "lchelagat@gmail.com"
    val propertyOwned =  "Sunrise Apartments"
    var profileStatus = "Verified"


    println("Landlord Name: $landlordName")
    println("Landlord Id: $landlordId")
    println("Phone Number: $landlordPhoneNo")
    println("Email: $landlordEmail")
    println("Property Owned: $propertyOwned")
    println("Profile Status : $profileStatus")


    //Property  Details

    println("\n Property info: \n")
    val propertyName: String = "Sunrise Apartments"
    val propertyId: Int = 3001
    val numberOfUnits = 6
    val propertyAddress: String = "Sun Road - 04506"
    val propertyStatus = "Verified"
    val currentTenants = 3
    val monthlyRent: Int = 30000



    println("Property Name: $propertyName")
    println("Property ID: $propertyId")
    println("Number of Units : $numberOfUnits")
    println("Number of Tenants $currentTenants")
    println("Property Address: $propertyAddress")
    println("Property Status: $propertyStatus")
    println("Monthly Rent: $monthlyRent")


    //Registration of new property listings

    println(" \n Enter Property name: \n ")
    val newPropertyName = readln()
    println("Enter Property ID:")
    val newPropertyId = readln().toInt()
    println("Enter Number Units:")
    val newPropertyUnits = readln().toInt()
    println("Enter Number Tenants:")
    var numberOfTenants = readln().toInt()
    println("Enter Property Address:")
    val newPropertyAddress = readln()
    println("Enter Property Status:")
    var newPropertyStatus = readln()
    println("Enter Property Monthly Rent:")
    var newPropertyMonthlyRent = readln().toInt()

println(" \n New Property Details: \n")
    println("Property Name: $newPropertyName")
    println("Property ID: $newPropertyId")
    println("Number of Units : $newPropertyUnits")
    println("Property Address: $newPropertyAddress")
    println("Property Status: $newPropertyStatus")
    println("Monthly Rent: $newPropertyMonthlyRent")




































}






