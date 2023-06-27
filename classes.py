
class Stories:
   def __init__(self,title,moral_value,length,language):
       self.title=title
       self.moral_value=moral_value
       self.length=length
       self.language=language


   def getStory(self):
       return f"The story {self.title}  teaches a moral of {self.moral_value}  is of length {self.length}.The language used in this story is {self.language}" 


story= Stories ("Born A crime","Do not give up",12,"English")
print(story.getStory())




class StoryTeller:
   def __init__(self,name,language, title):
       self.name =name
       self.title=title
       self.language=language
   def tellStories(self):
       return f"{self.name} is telling {self.title} in {self.language}"


stories=StoryTeller("Grace Ogot","Luo","Tekayo")
print(stories.tellStories()) 


class Translator(StoryTeller):
   def __init__(self,targetLanguage,name, title,language):
       self.name=name
       self.title=title
       self.language=language
       self.targetLanguage=targetLanguage


   def tellStory(self):
       return f"{self.name} translates {self.title} from {self.language} to {self.targetLanguage}" 


translate=Translator("Luo" ,"Paula Karimi","Tekayo","Kiswahili") 
print(translate.tellStory())  


# **African Cuisine:** You're creating a recipe app specifically for African cuisine.
# The app needs to handle recipes from different African countries, each with its
# unique ingredients, preparation time, cooking method, and nutritional
# information. Consider creating a `Recipe` class, and think about how you might
# create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
# `EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
# Methods.




class Recipe:
    def __init__(self,name,country,unique_ingredients,preparation_time,cooking_method,nutritional_value) :
        self.name=name
        self.country=country
        self.unique_ingredients=unique_ingredients
        self.preparation_time=preparation_time
        self.cooking_method=cooking_method
        self.nutritional_value=nutritional_value
class MoroccanRecipe(Recipe):
   def __init__(self, name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value):
       super().__init__(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value)
   def cook(self):
       return f"For {self.name} in {self.country}  cook the meal with {self.unique_ingredients} for {self.preparation_time} by {self.cooking_method} to gain  more {self.nutritional_value}"
   def allergerns(self,allergerns):
       if self.unique_ingredients == allergerns:
           return f"The food is not safe for consumption"
       else:
           return f"The food is safe for consumption"
class EthopianRecipe(Recipe):
   def __init__(self, name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value):
       super().__init__(name, country, unique_ingredients, preparation_time, cooking_method, nutritional_value)
def cook(self):
       return f"For {self.name} in {self.country}  cook the meal with {self.unique_ingredients} for {self.preparation_time} by {self.cooking_method} to gain  more {self.nutritional_value}"
moroccan= MoroccanRecipe("Wheat","Morocco","vinegar","30 minutes","grilling","cumin")
ethiopian= EthopianRecipe("chicken_breasts","Ethiopia","white wine","45 minutes","stewing","doro wat")
nigerian=NigerianRecipe("Jollof","Nigeria","pepper","3 hours","stirring","proteins")
print(nigerian.cook())
print(moroccan.cook())
print(ethiopian.cook())