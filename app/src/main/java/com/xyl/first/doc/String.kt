package com.xyl.first.doc

/**
 * Copyright (c) 2022 Raysharp.cn. All rights reserved.
 *
 * String
 * @author xieyulei
 * @date 2022-06-16
 */
fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }
    }
    return count
}