def floodFill(image, sr, sc, color):
  old_color = image[sr][sc]
  if old_color == color:
    return
  fill(image, sr, sc, old_color, color)
  return image


def fill(image, sr, sc, old_color, new_color):
  if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(
      image[0]) or image[sr][sc] != old_color:
    return
  image[sr][sc] = new_color
  fill(image, sr - 1, sc, old_color, new_color)
  fill(image, sr + 1, sc, old_color, new_color)
  fill(image, sr, sc - 1, old_color, new_color)
  fill(image, sr, sc + 1, old_color, new_color)


image = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
print(floodFill(image, 1, 1, 2))
