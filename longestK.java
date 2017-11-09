{\rtf1\ansi\ansicpg936\cocoartf1504
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;\csgray\c100000;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int lengthOfLongestSubstringKDistinct(String s, int k) \{\
        int[] map = new int[256];\
        int size = 0;\
        int start = 0;\
        int result = 0;\
        if( k <= 0)\{\
           return result;\
        \}\
        for (int i =0; i < s.length(); i++)\{\
            char cI = s.charAt(i);\
            map[cI]++;\
            if(map[cI] == 1 )\{\
                  size++;\
            \}\
            if( size == k + 1)\{\
                for (int j = start; j < i; j++)\{\
                       map[s.charAt(j)]--;\
                    if(map[s.charAt(j)] == 0)\{\
                        size = k;\
                        start = j + 1;\
                        break;\
                    \}\
                    \
                \}\
                \
            \}\
            result = Math.max(result, i - start + 1);\
        \}\
        return result;\
    \}\
\}}