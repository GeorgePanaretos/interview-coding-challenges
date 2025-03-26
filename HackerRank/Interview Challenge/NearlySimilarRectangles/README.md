# Nearly Similar Rectangles

Recently, while researching about similar rectangles, you found the term "Nearly Similar Rectangle." Two rectangles with sides `(a, b)` and `(c, d)` are nearly similar only if `a/c = b/d`. The order of sides matter in this definition, so rectangles `[4, 2]` and `[6, 3]` are nearly similar, but rectangles `[2, 4]` and `[6, 3]` are not.  
Given an array of rectangles with the lengths of their sides, calculate the number of pairs of nearly similar rectangles in the array.

## Example

For example, let's say there are `n = 4` rectangles, and  
` sides = [[5, 10], [10, 10], [3, 6], [9, 9]]`.  
In this case, the first and third rectangles, with sides `[5, 10]` and `[3, 6]`, are nearly similar because 5/3 = 10/6.  
Also, the second and fourth rectangles, with sides `[10, 10]` and `[9, 9]`, are nearly similar because 10/9 = 10/9.  
This means there are 2 pairs of nearly similar rectangles in the array. Therefore, the answer is `2`.

---

## Function Description

Complete the function `nearlySimilarRectangles` in the editor below.

### Parameters:

- `int sides[n][2]`: a 2-dimensional integer array where the i<sup>th</sup> row denotes the sides of the i<sup>th</sup> rectangle

### Returns:

- `int`: the number of nearly similar rectangles in the array

---

## Sample Case 0

### Input
```
3  
2  
4 8  
15 30  
25 50
```

### Output
```
3
```

### Explanation

In this example, `n = 3` and `sides = [[4, 8], [15, 30], [25, 50]]`.

- The first and second rectangles, with sides `[4, 8]` and `[15, 30]`, are nearly similar because 4/15 = 8/30.
- The first and third rectangles, with sides `[4, 8]` and `[25, 50]`, are nearly similar because 4/25 = 8/50.
- The second and third rectangles, with sides `[15, 30]` and `[25, 50]`, are nearly similar because 15/25 = 30/50.

This means there are 3 pairs of nearly similar rectangles in this array. Therefore, the answer is `3`.
