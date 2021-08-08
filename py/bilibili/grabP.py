# -*- coding: utf-8 -*-
import requests
from bs4 import BeautifulSoup
import json

def getPages(bvid):
    URL = "https://www.bilibili.com/video/%s"%bvid
    response = requests.get(URL)
    assert response.status_code == 200
    text = response.text
    soup = BeautifulSoup(text)
    # print(soup.prettify())

    script = soup.find_all('script')
    # print(len(script))
    for one in script:
        # print(one)
        text = one.string
        # print(text)
        if None!= text and text.startswith("window.__INITIAL_STATE__"):
            text = text.replace("window.__INITIAL_STATE__=", "")
            index = text.find(";(function()")
            text = text[0:index]
            returnMap = json.loads(text)
            pages =  returnMap.get('videoData').get('pages')
            for page in pages:
                # print(page['duration'])
                minutes = page['duration']//60
                seconds = page['duration'] - minutes * 60
                print("p%s/%s/%s:%s"%(page['page'], page['part'], minutes, seconds))
            return pages

# getPages('BV1UK411F7YU')
# getPages('BV1754y1R7FL')