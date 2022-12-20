fun main() {
    // Read the salary from the user
    print("Enter your salary: ")
    val salary: Int = readLine()!!.toInt()

    // Create a map to store the categories and their percentages
    val categories = mutableMapOf<String, Int>()

    // Read categories from the user until they enter an empty category
    while (true) {
        print("Enter a category (or leave blank to stop): ")
        val category = readLine()!!.trim()

        if (category.isEmpty()) {
            break
        }

        print("Enter the percentage of salary for $category: ")
        val percentage: Int = readLine()!!.toInt()

        val amount = salary * percentage / 100
        categories[category] = amount
    }

    // Calculate the amount of salary allocated to each category
    for ((category, amount) in categories) {
        println("$category: $amount")
    }

    // Allow the user to add a new category
    while (true) {
        print("Do you want to add a category? (y/n): ")
        val answer = readLine()!!.trim()

        if (answer == "y") {
            print("Enter the new category: ")
            val newCategory = readLine()!!.trim()

            print("Enter the percentage of salary for $newCategory: ")
            val percentage: Int = readLine()!!.toInt()

            val amount = salary * percentage / 100
            categories[newCategory] = amount
        } else if (answer == "n") {
            break
        }
    }
}