fun main(){
    print("Enter your marks")
    var input = readLine()

    if (input!= null && input.isNotEmpty()){

        var marks = input.trim().toInt()
        if (marks in 90..100){
            println("Grade is: A+")
        }else if(marks in 80..89){
            println("Grade is: A")
        }else if(marks in 70..79){
            println("Grade is: B")
        }else if(marks in 60..69){
            println("Grade is: C")
        }else if(marks in 0..49){
            println("Grade is: F")
        }
    }else{
        println("Enter valid Marks")
    }



}