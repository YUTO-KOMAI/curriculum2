//問１

let numbers = [2, 5, 12, 13, 15, 18, 22];

function isEven() {
    for(let num=0; num<numbers.length; num++){
        if(numbers[num] % 2 ===0){
    console.log(`${numbers[num]}は偶数です`);
        }
    }
}
isEven();


//問２

class Car{
    constructor(gas,num){
        this.gas=gas;
        this.num=num;
    }
    getNumGas(){
    console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です。`);
    }
}
let car = new Car(20,1126);
car.getNumGas();