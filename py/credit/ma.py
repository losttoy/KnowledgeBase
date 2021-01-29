# -*- coding: utf-8 -*-
import json
import sys
from Credit import Credit


mod = sys.argv[1]
month = sys.argv[2]
month = int(month)
principal = float(sys.argv[3])
pi = float(sys.argv[4])

buf = Credit(mod, month, principal, pi)
print("%s"%buf)

datas = '{"mod":"%s","month":%s,"principal":%s,"pi":%s}'%(mod, sys.argv[2], sys.argv[3], sys.argv[4])

print(datas)
json_str = json.loads(datas)
try:
    buf = Credit(json_str['mod'], json_str['month'], json_str['principal'], json_str['pi'])
except BaseException:
    buf = '出现异常'
print(buf)
