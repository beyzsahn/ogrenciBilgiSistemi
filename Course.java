package com.example.Java101.ogrenciBilgiSistemi;


public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    double oralPercentage;

    Course(String name,String code, String prefix, Teacher teacher, double oralPercentage){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.oralPercentage=oralPercentage;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
           // System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
        //System.out.println("Sözlünün etkisi: "+this.oralPercentage+"%");
        double oralContribution = calculateOralContribution(this.note);
        System.out.println("Sözlü Notunun Ortalamaya Etkisi: " + oralContribution);

    }
    double calculateOralContribution(int oralNote) {
        return oralNote * (oralPercentage / 100.0);

    }


}
