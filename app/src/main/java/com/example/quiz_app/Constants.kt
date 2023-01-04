package com.example.quiz_app

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "South Africa", "Peru",
            "Columbia", "Brazil",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "New Zealand", "Australia",
            "bolivia", "Austria",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Austria",
            "Hungray", "Czech Republic",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Ethiopia", "Croatia",
            "Iceland", "Denmark",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Chad",
            "Kazakhstan", "Belarus",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Turkey", "Germany",
            "Poland", "Belgium",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "China", "Egypt",
            "India", "Angola",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Italy", "Kuwait",
            "Algeria", "Hungary",
            2
        )
        questionsList.add(que9)

        val que10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Iceland", "Finland",
            "United Kingdom", "New Zealand",
            4
        )
        questionsList.add(que10)

        return questionsList

    }


}