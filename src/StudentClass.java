import java.util.Arrays;

public class StudentClass implements CRUDSystem {

        public String[] students = {"Sukran", "Mammadli", "1"};


    @Override
    public void add(String name, String surname, String[] s) {
         this.students  = new String[s.length+3];
        for(int i=0; i<s.length; i++){
            this.students[i]=s[i];
        }

        this.students[s.length]=name;
        this.students[s.length+1]=surname;
        this.students[s.length+2]= String.valueOf(Integer.parseInt(s[2])+1);

       yazilis();


    }


    @Override
    public void remove(int i){

        for(int r=2; r<this.students.length; r+=3){
            int seac = Integer.parseInt(this.students[r]);
            if(seac == i || i==1){
                this.students[r]="";
                this.students[r-1]="";
                this.students[r-2]="";

            }else{
                System.out.println("Bele ID de sagird yoxdur");
            }
        }

        System.out.println("Sagird Ugurla Silindi");
    }
    @Override
    public void update(int id, String name, String surname){
        for(int r=2; r<this.students.length; r+=3){
            int seac = Integer.parseInt(this.students[r]);
            if(seac == id){

                this.students[r-1]=surname;
                this.students[r-2]=name;

            }else{
                System.out.println("Bele ID de sagird yoxdur");
            }
        }

        System.out.print("Id  ");
        System.out.print(" Ad       ");
        System.out.print("SoyAd");
        for(int t=0; t<this.students.length; t++) {
            if(t==0){
                System.out.println("");
                System.out.print(this.students[2]+"    ");
            }else if(t==1){
                System.out.print(this.students[1]+"    ");
            } else if (t==2) {
                System.out.print(this.students[0]+"  ");
            }



        }
    }

    @Override
    public void select(int id){
        String[] selected = new String[3];
        for(int r=2; r<this.students.length; r+=3){
            int seac = Integer.parseInt(this.students[r]);
            if(seac == id){
                selected[0]=this.students[r-2];
                selected[1]=this.students[r-1];
                selected[2]=this.students[r];

               // this.students[r-1]=surname;
               // this.students[r-2]=name;

            }else{
                System.out.println("Bele ID de sagird yoxdur");
            }
        }

        System.out.print("Id  ");
        System.out.print(" Ad       ");
        System.out.print("SoyAd");
        for(int t=0; t<this.students.length; t++) {
            if(t==0){
                System.out.println(this.students[2]);
            }else if(t==1){
                System.out.print(this.students[1]+"    ");
            } else if (t==2) {
                System.out.print(this.students[0]+"  ");
            }



        }
    }






    public void yazilis(){
         System.out.print("Id  ");
        System.out.print(" Ad       ");
        System.out.print("SoyAd");
        for(int t=0; t<this.students.length; t++) {
            if(t==0){
                System.out.println("");
            }else if(t%3==0){
                System.out.print(this.students[t]+"    ");
            } else if (t%2==0) {
                System.out.print(this.students[t]+"  ");
            }



        }
    }





}
