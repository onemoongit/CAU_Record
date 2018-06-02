package com.sutda.card;

public class Rank {

    private int monthOne;
    private int propertyOne;
    private int monthTwo;
    private int propertyTwo;
    private int rank;
    // rank가 낮을수록 이긴다.

    public Rank(Card one , Card two) {
        this.monthOne = one.getMonth();
        this.propertyOne = one.getProperty();
        this.monthTwo = two.getMonth();
        this.propertyTwo = two.getProperty();
    }

    // 땡잡이 , 구사 , 멍텅구리 구사 , 암행어사
//    public String checkSpecial(){
//
//    }

    public String checkPare(){
        if
                ( this.propertyOne == 2 && this.propertyTwo ==2
                && (this.monthOne == 3 || this.monthOne == 8)
                && (this.monthTwo == 3 || this.monthTwo == 8)
                )
        {
            this.rank = 100;
            return " 3 8 광땡 ";
        }else if
                (this.propertyOne == 2 && this.propertyTwo ==2
                && (this.monthOne == 3 || this.monthOne == 8 || this.monthOne == 1)
                && (this.monthTwo == 3 || this.monthTwo == 8 || this.monthTwo == 1)
                )
        {
            this.rank = 101;
            return " "+this.monthOne+" "+this.monthTwo+" 광땡 ";
        }

        if(this.monthOne == this.monthTwo){
            this.rank = 200;
            return this.monthOne+" 땡 ";
        }

        if((this.monthOne == 1 || this.monthTwo == 2 ) || (this.monthOne == 2 || this.monthTwo == 1 )){
            this.rank = 301;
            return " 알리 ";
        }else if((this.monthOne == 1 || this.monthTwo == 4 ) || (this.monthOne == 4 || this.monthTwo == 1 )){
            this.rank = 302;
            return " 독사 ";
        }else if((this.monthOne == 1 || this.monthTwo == 9 ) || (this.monthOne == 9 || this.monthTwo == 1 )){
            this.rank = 303;
            return " 구삥 ";
        }else if((this.monthOne == 1 || this.monthTwo == 10 ) || (this.monthOne == 10 || this.monthTwo == 1 )){
            this.rank = 303;
            return " 장삥 ";
        }else if((this.monthOne == 4 || this.monthTwo == 10 ) || (this.monthOne == 10 || this.monthTwo == 4 )){
            this.rank = 304;
            return " 장사 ";
        }else if((this.monthOne == 4 || this.monthTwo == 6 ) || (this.monthOne == 6 || this.monthTwo == 4 )){
            this.rank = 305;
            return " 장삥 ";
        }else if(this.monthOne + this.monthTwo == 10){
            this.rank = 306;
            return " 갑오 ";
        }else{
            int temp = this.monthOne + this.monthTwo;
            if(temp == 10) {
                this.rank = 500;
                return " 망통 ";
            }else{
                this.rank = 410 - this.monthOne - this.monthTwo;
                return " "+(this.monthOne - this.monthTwo) + "끗 ";
            }
        }


    }

    public int getRank() {
        return rank;
    }
}
