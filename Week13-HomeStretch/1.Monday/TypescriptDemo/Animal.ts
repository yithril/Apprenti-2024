export class Animal {
    type:string;
    name:string;
    canFly:boolean;

    constructor(type:string, name:string, canFly:boolean){
        this.type = type;
        this.name = name;
        this.canFly = canFly;
    }

    makeSound() : void {
        console.log('Makes an animal sound');
    }
}