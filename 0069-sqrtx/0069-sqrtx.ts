function mySqrt(x: number): number {
    if(x<2)return x;

    for(let i=1;i<=x;i++){
        if(i*i==x){
            return i;
        }

        if(i*i>x){
            return i-1;
        }
    }
    return 0;
};