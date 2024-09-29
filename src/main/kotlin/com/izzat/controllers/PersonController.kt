package com.izzat.controllers

import com.izzat.models.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("persons", name = "Person Controller")
class PersonController {

    var listOfPerson = listOf(
        Person(UUID.randomUUID(), "Kiril"),
        Person(UUID.randomUUID(), "Anton"),
        Person(UUID.randomUUID(), "Opa"),
        Person(UUID.randomUUID(), "Momads"),
        Person(UUID.randomUUID(), "Kojah"),
        Person(UUID.randomUUID(), "Yujan"))

    @GetMapping(produces = ["application/json"])
    fun GetAll(): List<Person>
    {
        return listOfPerson;
    }

    @GetMapping("index/{index}", produces = ["application/json"])
    fun GetByIndex(@PathVariable index: Int): Person
    {
        return listOfPerson[index];
    }

    @GetMapping("name/{name}",produces = ["application/json"])
    fun GetByName(@PathVariable name: String): Person?
    {
        return listOfPerson.find { it.name.lowercase(Locale.getDefault()) == name.lowercase(Locale.getDefault()) };
    }

    @GetMapping("name", produces = ["text/plain"])
    fun GetControllerName(): String?
    {
        return PersonController::class.simpleName;
    }
}