#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdint.h>
#include <stdbool.h>

#define MAX_NAME 256
#define TABLE_SIZE 10

typedef struct
{
    char name[MAX_NAME];
    int age;
} person;

person *hash_table[TABLE_SIZE];

unsigned int hash(char *name)
{
    int length = strnlen(name, MAX_NAME);
    unsigned int hash_value = 0;
    for (size_t i = 0; i < length; i++)
    {
        hash_value = name[i];
        hash_value = (hash_value * name[i] + 21) % TABLE_SIZE;
    }

    return hash_value;
}
bool init_hash_table()
{
    for (size_t i = 0; i < TABLE_SIZE; i++)
    {
        hash_table[i] = NULL;
    };
}
void print_table()
{
    for (size_t i = 0; i < TABLE_SIZE; i++)
    {
        if (hash_table[i] == NULL)
        {
            printf("\t%i\t---\n", i);
        }
        else
        {
            printf("\t%i\t%s\t%i\n", i, hash_table[i]->name, hash_table[i]->age);
        }
    }
}
bool hash_table_insert(person *p)
{
    if (p == NULL)
        return false;
    int index = hash(p->name);
    if (hash_table[index] != NULL)
        return false;
    hash_table[index] = p;
    return true;
}
person *hash_table_lookup(char *name)
{
    int index = hash(name);
    if (hash_table[index] != NULL && strcmp(hash_table[index]->name, name) == 0)
    {
        return hash_table[index];
    }
    else
    {
        return NULL;
    }
}
person *hash_table_delete(char *name)
{
    int index = hash(name);
    if (hash_table[index] != NULL && strcmp(hash_table[index]->name, name) == 0)
    {
        person *tmp = hash_table[index];
        hash_table[index] = NULL;
        return tmp;
    }
    else
    {
        return NULL;
    }
}

int main()
{
    init_hash_table();
    print_table();

    person katie = {.name = "Katie", .age = 11};
    person derrick = {.name = "Derrick", .age = 54};
    person bridget = {.name = "Bridget", .age = 12};
    person oscar = {.name = "Oscar", .age = 32};
    person james = {.name = "James", .age = 42};
    person fik = {.name = "Fik", .age = 22};
    person jason = {.name = "Jason", .age = 42};
    person marios = {.name = "Marios", .age = 22};

    hash_table_insert(&katie);
    hash_table_insert(&derrick);
    hash_table_insert(&bridget);
    hash_table_insert(&oscar);
    hash_table_insert(&james);
    hash_table_insert(&fik);
    hash_table_insert(&jason);
    hash_table_insert(&marios);

    printf("Added people\n");
    print_table();

    person *tmp = hash_table_lookup("Katie");
    if (tmp == NULL)
    {
        printf("Not found!\n");
    }
    else
    {
        printf("Found: \t%s, Age: %d\n", tmp->name, tmp->age);
    }

    hash_table_delete("Katie");
    tmp = hash_table_lookup("Katie");
    if (tmp == NULL)
    {
        printf("Not found!\n");
    }
    else
    {
        printf("Found: \t%s, Age: %d\n", tmp->name, tmp->age);
    }
    print_table();
    // HANDLING COLLISIONS
   

        return 0;
}
