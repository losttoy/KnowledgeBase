# -*- coding: utf-8 -*- 

import numpy as np
import sys

class Credit:
  def __init__(self, mod, month, principal, pi):
    self.mod = mod
    self.month = month
    self.principal = principal
    self.pi = pi
    
  def __str__(self):

    mod = self.mod
    month = self.month
    principal = self.principal
    pi = self.pi

    if mod == '1':
    #usage
    #python ma.py 模型 期数（按月） 总本金 本息和
    #蚂蚁借呗号称日利率万三 一万借六个月需要还10334.17(由于第一个月的还款额超过一个月，故偏多)
    #python ma.py 1 6 10000 10334.17
    #年化利率=11.37%

    #房贷借100w 借5年 还款112.541472w
    #python ma.py 1 60 1000000 1125414.72
    #年化利率=4.75%
      args=[1]
      for i in range(1,month):
        args.append(0)
      args.append(-1-principal*1.0/pi*month)
      args.append(principal*1.0/pi*month)
      result =  np.roots(args)

      x = 12*((np.real(result[len(result)-1])**-1)-1)*100
      return ("%.2f%%"%(x))
    elif mod == '2':
    #usage
    #房贷借100w 借5年 还款112.072917w
    #python ma.py 2 60 1000000 1120729.17
    #年化利率=4.75%
      return ("%.2f%%"%(12.0*(pi-principal)*2.0/(month+1)/principal*100.0))
    elif mod == '3' or mod == '4':
    #usage
    #蚂蚁借呗一万借6个月 还10555
    #python ma.py 4 6 10000 10555
    #年化利率=4.75%
      return ("%.2f%%"%((pi*1.0/principal-1)/month*12*100))
    else:
      return "ERROR"