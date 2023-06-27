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