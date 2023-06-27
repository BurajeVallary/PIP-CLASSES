class Story {
constructor(title, description, moral_lesson, ageGroup) {
this.title = title;
this.text = description;
this.moral = moral_lesson;
this.ageGroup = ageGroup;
}
}
class StoryTeller {
constructor(name, title, language) {
this.name = name;
this.title = title;
this.language = language;
}
tellStories () {
return `${this.name} is telling ${this.title} in ${this.language}`;
}


};
let story= new StoryTeller("Grace Ogot","Tekayo","Luo")
console.log(story.tellStories());
class Translator extends StoryTeller {
constructor(name, title, language,targetLanguage) {
super()
this.name= name;
this.title=title;
this.language=language;
this.targetLanguage= targetLanguage;


}


tellStory(){


return ` ${this.name} translates ${this.title } from ${this.language} to ${this.targetLanguage} `
}


}
const translate= new Translator ("Paula Karimi","Tekayo","Luo","Kiswahili")
console.log(translate.tellStory()) ;

// African Cuisine:** You're creating a recipe app specifically for African cuisine.
// The app needs to handle recipes from different African countries, each with its
// unique ingredients, preparation time, cooking method, and nutritional
// information. Consider creating a `Recipe` class, and think about how you might
// create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
// `EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
// Methods.







class Recipe {
   constructor(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value) {
     this.name = name;
     this.country = country;
     this.unique_ingredients = unique_ingredients;
     this.preparation_time = preparation_time;
     this.cooking_method = cooking_method;
     this.nutritional_value = nutritional_value;
   }
 }
  class MoroccanRecipe extends Recipe {
   constructor(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value) {
     super(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value);
   }
    cook() {
     return `For ${this.name} in ${this.country}, cook the meal with ${this.unique_ingredients} for ${this.preparation_time} by ${this.cooking_method} to gain more ${this.nutritional_value}`;
   }
 }
  class EthiopianRecipe extends Recipe {
   constructor(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value) {
     super(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value);
   }
    cook() {
     return `For ${this.name} in ${this.country}, cook the meal with ${this.unique_ingredients} for ${this.preparation_time} by ${this.cooking_method} to gain more ${this.nutritional_value}`;
   }
 }
  class NigerianRecipe extends Recipe {
   constructor(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value) {
     super(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value);
   }
    cook() {
     return `For ${this.name} in ${this.country}, cook the meal with ${this.unique_ingredients} for ${this.preparation_time} by ${this.cooking_method} to gain more ${this.nutritional_value}`;
   }
 }
  const moroccan = new MoroccanRecipe("Wheat", "Morocco", "vinegar", "30 minutes", "grilling", "cumin");
 const ethiopian = new EthiopianRecipe("chicken_breasts", "Ethiopia", "white wine", "45 minutes", "stewing", "doro wat");
 const nigerian = new NigerianRecipe("Jollof", "Nigeria", "pepper", "3 hours", "stirring", "proteins");
  console.log(nigerian.cook());
 console.log(moroccan.cook());
 console.log(ethiopian.cook());