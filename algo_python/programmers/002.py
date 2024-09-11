'''
너무 노가다로 한듯?

답안보니 다들 이렇게하네 이게 최선인가;
'''

def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    
    
    if timeToMin(op_start) <= timeToMin(pos) <= timeToMin(op_end):
        pos = op_end
    
    for i in commands:
        if i == "next":
            if timeToMin(pos)+10 > timeToMin(video_len):
                pos = video_len
            else :
                pos = minToTime(timeToMin(pos)+10)
        elif i == "prev":
            if timeToMin(pos)-10 <0:
                pos = "00:00"
            else :
                pos = minToTime(timeToMin(pos)-10)
        
        if timeToMin(op_start) <= timeToMin(pos) <= timeToMin(op_end):
            pos = op_end
        
    answer = pos
    #print(pos)
    
    return answer

def timeToMin(time):
    t = time.split(":")
    return int(t[0]) * 60 + int(t[1])

def minToTime(time):
    if time == 0:
        return "00:00"
    a = int(time / 60)
    b = time % 60
    c = str(a)
    d = str(b)
    if int(a) < 10:
        c = "0" + str(a)

    if int(b) < 10:
        d = "0" + str(b)
        
    return c + ":" + d

print(solution("34:33"	,"13:00"	,"00:55"	,"02:55"	,["next", "prev"]))