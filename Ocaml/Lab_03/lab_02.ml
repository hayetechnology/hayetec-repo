let circle_circum_v1 r = 2.0*.3.1415*.r

let circle_circum_v2 r = let pi = 3.1415 in 2.0*.pi*.r

let rec product x = match x with
  |[] -> 1
  |(h::t) -> h * (product t)
  (*Sam suggested I indent better*)

let rec sum_sqrdiffs x = match x with
  (*Hanei Moubarak suggested I raise an error incase the arguments of the
  function are too short*)
  |x1::(x2::[]) -> (x1 - x2) * (x1 - x2)
  |x1::x2::rest -> (x1 - x2) * (x1 - x2) + sum_sqrdiffs(x2 :: rest)
  |_-> raise (Failure"Error! input list is too short")

let distance (x1,y1) (x2,y2) = sqrt((x1 -.x2) ** 2. +.(y1-.y2) **2.)

let triangle_perimeter (x1,y1) (x2,y2) (x3,y3) =
distance (x1,y1) (x2,y2) +. distance (x2,y2) (x3,y3) +. distance (x1,y1) (x3,y3)
