plugins {
    application
    kotlin("jvm") version "1.6.0"
}

application {
    mainClassName="com.yang.MainDemo"
}

/*dependencies{
   compile(kotlin("stdlib"))
}*/

repositories {
    maven {
        url = uri("https://maven.aliyun.com/repository/gradle-plugin")
    }
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:1.6.0")
    implementation(kotlin("stdlib-jdk8"))


}


task ("hello") {
    println("hello hi hahahah ")
}

task("pre"){
   println("执行。。。")
    doFirst("doFist"){
        println("pre-doFist")
    }

    doLast("doLast"){
        println("pre-dolat")
    }
}

task("do"){
    doFirst("doFist"){
        println("do-doFist")
    }

    doLast("doLast"){
        println("do-late")
    }
}.dependsOn("pre")

task("post"){
    doFirst("doFist"){
        println("post-doFist")
    }

    doLast("doLast"){
        println("post-dolat")
    }
}.dependsOn("do")






