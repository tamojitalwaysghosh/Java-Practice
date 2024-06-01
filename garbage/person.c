// #include<stdio.h>
// #include<stdlib.h>

// struct Person{
//     char *name;
//     int age;
// };

// int main(){
//     //dynamic memory allocation using malloc()
//     struct Person *p=(struct Person *)malloc(sizeof(struct Person));

//     if(p==NULL){
//         printf("memory allocation failed");
//         return 1;
//     }

//     p->name= "John";
//     p->age= 30;

//     //memory allocated is freed to prevent memory leak
//     free(person);
    
//     return 0;
// }