import functools

def setting(data):
    return data[1]


arr = [(1,4),(2,3),(3,2),(4,1)]

print(arr)

print(sorted(arr,key=setting))