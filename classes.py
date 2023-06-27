
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
