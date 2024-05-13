// TODO

struture de mon implementation de partern design DAO

creation de la stucture

        ---src/main/java/{groupID}/DAO


        ---src/main/java/{groupID}/DAOI ==> contient les Interfaces qui definissent les fonctionnaliter
        lié a la manipulation de l'entiter DAO auquel il est liée

                ex: save(); update(); finByID(); delete(); etc...

        ---src/main/java/{groupID}/DAOIImplementation ==> contient les classes qui implemente les  fonctionnaliter
        définie par l'interface auquel il est liée

                ex: class ProduitIImplementation implements IProduit {}
