fun main() {




    val recipes = Recipe(   arrayOf("Rice", "Spices"), "one hour",
        "fry the meat till golden under low heat", "proteins and energy")
    val ethiopianRecipe = EthiopianRecipe("grounded wheat", arrayOf("Wheat", "brown wheat"),
        " am maximum of three days",
        "ferment the flour the fry it under low heat for two minute",
        "energy"
    )
    ethiopianRecipe.ethiopiansSpecial()
 
 
 }
 
 
 
 
 open class Recipe(var ingredients: Array<String>, var preparationTime: String, val cookingMethod: String, var nutritionalValue: String) {
 
 
    fun getIngredients() {

        println("The ingredients is $ingredients")

 
 
    }
 fun checkallergerns(){
    if (allergens == null)
    allergens=arrayOf<String>(){
    else{
        print(allergens[0])
        }
 }


    fun getPreparationTime() {
        println("$preparationTime ")


 
 
    }
 
 
 
 
    fun getCookingMethod() {
        println("$cookingMethod")

 
 
    }
 
 
 
 
    fun servingportions(){
        println("$servingPortion")
        }
       
    }
 
 }
 
 
 class MorrocanRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
    
 nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
    fun specialRecipe() {
        println("The special recipe of Morocco is $specialIngredient")
 
 
    }
 
 
 }
 
 
 
 
 class EthiopianRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
    nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
 
 
    fun ethiopiansSpecial() {
        println("The special recipe of Ethiopia is $specialIngredient")
 
 
 
 
    }
 
 
 }
 
 
 class NigerianRecipe(var specialIngredient: String, ingredients: Array<String>, preparationTime: String, cookingMethod: String,
    nutritionalValue: String) : Recipe(ingredients, preparationTime, cookingMethod, nutritionalValue) {
 
 
    fun nigerianSpecial() {
        println("The special recipe of Nigeria is $specialIngredient ")
       
    }
 }
 
 
 
 
 
 
 
 
 
 