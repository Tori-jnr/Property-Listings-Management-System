
fun main() {


    //Tenant information

    println("_______________________________________")
    println("Welcome to our Tenant Management System")
    println("_______________________________________\n")

    //Property  Details

    println("Property 1 info \n")
    val propertyName: String = "Sunrise Apartments"
    val propertyId: Int = 3001
    val numberOfUnits = 6
    val propertyAddress: String = "Sun Road - 04506"
    val landlordName = "Linda Chelagat"
    val landlordId = 201
    var unitStatus :String = ""
    var hasTenant :Boolean = true

    if (hasTenant) {
        unitStatus = "Assigned"
    }else {
        unitStatus = "Vacant"

    }

    println("Property Name: $propertyName")
    println("Property ID: $propertyId")
    println("Number of Units : $numberOfUnits")
    println("Property Address: $propertyAddress")
    println("Landlord Name: $landlordName")
    println("Landlord Id: $landlordId")
    println("Unit Status: $unitStatus")


    //tenant 1

    println("Tenants info \n")
    val tenantNames = mutableListOf ("Yvonne Wambui","John Kirui", "Nina Almasi")
    val tenantIds  = mutableListOf (101,102,103)
    val houseNumbers = mutableListOf ("A-102","A-104","A-106")
    val phoneNumbers = mutableListOf ("0780796245","0700385624","0790436875")
    var tenantEmails = mutableListOf ("wambui@gmail.com"," kirui@gmail.com", "almasi@gmail.com")
    var paymentModes = mutableListOf("credit card","M-pesa", "Cash")
    val rentDueList = mutableListOf(40000,30000,25000)


    val availableUnits = numberOfUnits - tenantNames.size

    for ((index, name) in tenantNames.withIndex()) {
        println("Tenant Name: $tenantNames")
        println("Tenant Id: $tenantIds[0]")
        println("House Number: $houseNumbers[0]")
        println("Phone Number: $phoneNumbers")
        println("email: $tenantEmails")
        println("mode of payment: $paymentModes")
        println("Rent: $rentDueList")

        println("key in amount paid")
        var amountPaidList = readln() .toInt()
        println("Amount: $amountPaidList")

        var isRentPaidList: Boolean = amountPaidList >= rentDueList[index]
        println("Tenant Paid : $isRentPaidList")

        if (isRentPaidList) {
            println("Thank you for the early rent pay")
        } else {
            println("please clear your balance $rentDueList - $amountPaidList")
        }
        println("Available Units: $availableUnits")
    }



}
