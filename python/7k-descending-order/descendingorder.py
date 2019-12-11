def descending_order(num):
    num_list = list(map(int,str(num)))
    num_list = sorted(num_list,reverse=True)
    output =  ''.join(map(str, num_list))
    return int(output)
