def ouvrante(car:str)->bool:
    """_summary_

    Args:
        car (str): _description_

    Returns:
        bool: _description_
    """
    return car in ['{','(','[']


def fermante(car:str)->bool:
    """_summary_

    Args:
        car (str): _description_

    Returns:
        bool: _description_
    """
    return car in [']',')','}']


def renverse(car:str)-> str:
    """_summary_

    Args:
        car (str): _description_

    Returns:
        str: _description_
    """
    if car == ')':
        return '('
    elif car == '}':
        return '{'
    elif car == ']':
        return '['
    else:
        return car

def operateur(car : str)-> bool:
    """_summary_

    Args:
        car (str): _description_

    Returns:
        bool: _description_
    """
    return car in ['+','*']

def nombre(car: str)->bool:
    """_summary_

    Args:
        car (str): _description_

    Returns:
        bool: _description_
    """
    return car.isdigit()

def caractere_valide(car:str)->bool:
    """_summary_

    Args:
        car (str): _description_

    Returns:
        bool: _description_
    """
    
    
    return ouvrante(car) or fermante(car) or nombre(car) or operateur(car) or car.isspace()

print(caractere_valide(' '))



