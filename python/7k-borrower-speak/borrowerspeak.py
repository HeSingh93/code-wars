import re
def borrow(s):
    return re.sub(r"[ ?!;,.:]", "", s.lower())
