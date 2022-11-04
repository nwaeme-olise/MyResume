package com.olisemeka.myresume

object Datasource {
    fun loadData(): ArrayList<Skill>{
        return arrayListOf(
            Skill(R.drawable.img_kotlin, "Kotlin"),
            Skill(R.drawable.img_android, "Android Framework"),
            Skill(R.drawable.img_java, "Java"),
            Skill(R.drawable.img_py, "Python"),
            Skill(R.drawable.img_git, "Git")


        )
    }
}