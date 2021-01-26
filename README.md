# SpringBootNeo4j
Communication entre SpringBoot et Neo4j

#Commands pour la création de la basée Neo4j

create (u:User {name:'Jean Pierre' , age: 26})
create (m:Movie {title: 'Les visiteurs' , director: 'Jean Jacques'})

#Création de la Relation des noueds

match (u:User) match (m:Movie) create (u)-[a:actor]->(m) return a
