def ouvrante(car : str) -> bool:
    CAS = ["(","{","["]
    return car in CAS

def fermante(car:str) -> bool:
    CAS = [")","}","]"]
    return car in CAS

def reverse(car : str) -> str:
    CAS = ["(","{","["," ",]
    if fermante(car):
        if car == ")":
            return "("
        elif car == "}":
            return "{" 
        else:
            return "["
    elif car in CAS:
        return car
    else:
        return ""

print(reverse(" "))