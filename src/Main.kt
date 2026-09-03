// Concept Note :https://docs.google.com/document/d/1-V8BqZSj4NrHNxJqwYgSpkDc-ylf_DxNTDU1wsRzXBI/edit?usp=sharing
// Group Members:
// 200159 - Juliet Nyakiamo
// 175852 - Lumumba Kimberly
// 192789 - Salama Shali
// 189600 - Gitacu Elizabeth



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
    val propertyNames = mutableListOf("Sunrise Apartments")
    val propertyIds = mutableListOf (3001)
    val numberOfUnits = mutableListOf (6)
    val propertyAddresses = mutableListOf("Sun Road - 04506")
    val propertyStatuses = mutableListOf("Verified")
    val currentTenants = mutableListOf(3)
    val monthlyRent = mutableListOf(30000)
    var unitStatus = "Assigned"



    println("Property Name: $propertyNames")
    println("Property ID: $propertyIds")
    println("Number of Units : $numberOfUnits")
    println("Number of Tenants $currentTenants")
    println("Property Address: $propertyAddresses")
    println("Property Status: $propertyStatuses")
    println("Monthly Rent: $monthlyRent")
    println("Unit Status: $unitStatus")


    //Registration of new property listings
println("\n Register New Property listing:")
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

    //Save newly created listings
    propertyNames.add(newPropertyName)
    propertyIds.add(newPropertyId)
    numberOfUnits.add(newPropertyUnits)
    currentTenants.add(numberOfTenants)
    propertyAddresses.add(newPropertyAddress)
    propertyStatuses.add(newPropertyStatus)
    monthlyRent.add(newPropertyMonthlyRent)


    println("Is the property available? (yes/no):")
    val availabilityInput = readln()
    val isAvailable: Boolean = availabilityInput.equals("yes", ignoreCase = true)

    val availabilityList = mutableListOf(true)
    availabilityList.add(isAvailable)

    println(" \n New Property Details: \n")
    println("Property Name: $newPropertyName")
    println("Property ID: $newPropertyId")
    println("Number of Units : $newPropertyUnits")
    println("Property Address: $newPropertyAddress")
    println("Property Status: $newPropertyStatus")
    println("Monthly Rent: $newPropertyMonthlyRent")
    println("Available: $isAvailable")


    println("\n----- Check Property Availability -----")
    println("Enter the Property Name you want to check:")
    val searchName = readln()

    val searchIndex = propertyNames.indexOf(searchName)

    if (searchIndex == -1) {
        println("Sorry, no property found with that name.")
    } else if (availabilityList[searchIndex]) {
        println("$searchName is currently AVAILABLE.")
    } else {
        println("$searchName is currently NOT available.")
    }


println(" \n New Property Details: \n")
    println("Property Name: $newPropertyName")
    println("Property ID: $newPropertyId")
    println("Number of Units : $newPropertyUnits")
    println("Property Address: $newPropertyAddress")
    println("Property Status: $newPropertyStatus")
    println("Monthly Rent: $newPropertyMonthlyRent")

    // Display Listings

println(" \n Display Listings: \n ")
    for (i in propertyNames.indices) {

        println("\nProperty ${i + 1}")
        println("-----------------------------------")
        println("Property Name: ${propertyNames[i]}")
        println("Property ID: ${propertyIds[i]}")
        println("Number of Units: ${numberOfUnits[i]}")
        println("Number of Tenants: ${currentTenants[i]}")
        println("Property Address: ${propertyAddresses[i]}")
        println("Property Status: ${propertyStatuses[i]}")
        println("Monthly Rent: Ksh ${monthlyRent[i]}")
    }


    // COUNT THE NUMBER OF PROPERTIES

    println("\nTotal Number of Properties: ${propertyNames.size}")


































}






