package com.alexblanco.recyclerview_video

class SuperHeroProvider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            ),
            SuperHero(
                "Daredevil",
                "Marvel",
                "Matthew Michael Murdock",
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
            ),
            SuperHero(
                "Wolverine",
                "Marvel",
                "James Howlett",
                "https://cursokotlin.com/wp-content/uploads/2017/07/wolverine.jpg"
            ),
        )
    }
}