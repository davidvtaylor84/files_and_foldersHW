package com.codeclan.filesandfolders.filesandfolders.components;

import com.codeclan.filesandfolders.filesandfolders.models.File;
import com.codeclan.filesandfolders.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.filesandfolders.models.Person;
import com.codeclan.filesandfolders.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!Test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        Person billy = new Person("Billy Holdover");
        personRepository.save(billy);

        Person janet = new Person("Dammit Janet");
        personRepository.save(janet);

        Folder what = new Folder("Top Secret Cakes and Muffins", billy);
        folderRepository.save(what);
        Folder gimme = new Folder("Files of soup", janet);
        folderRepository.save(gimme);
        Folder ahhellna = new Folder("Whatever dude", janet);
        folderRepository.save(ahhellna);
        Folder yeahyeah = new Folder("My sanity", billy);
        folderRepository.save(yeahyeah);
        Folder mudBrick = new Folder("Nothing herein", billy);
        folderRepository.save(mudBrick);

        File yup = new File("Green ham", "PCP", 78, what);
        fileRepository.save(yup);
        File jim = new File("Greedo's Last Words", "FBI", 98, what);
        fileRepository.save(jim);
        File jeezus = new File("Fart Salad", "POP", 87, gimme);
        fileRepository.save(jeezus);
        File brian = new File("Heave to", "GG ALLIN", 78, gimme);
        fileRepository.save(brian);
        File ghost = new File("Where dog?", "HHH", 45, ahhellna);
        fileRepository.save(ghost);
        File yoda = new File("The end of time", "PCP", 45, yeahyeah);
        fileRepository.save(yoda);
        File andor = new File("Samuel Beckett's horseplay", "CIA", 34, mudBrick);
        fileRepository.save(andor);
        File tim = new File("Where is jonny", "Not here", 12, mudBrick);
        fileRepository.save(tim);


    }
}
