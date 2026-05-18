use std::io;

fn iszero(m: i32) -> bool { m == 0 }
fn pi(m: i32) -> i32 { if m == 0 { 0 } else { m - 1 } }

fn fac(m: i32) -> i32 {
    if iszero(m) {
        1
    } else {
        m * fac(pi(m))
    }
}

fn main() {
    println!("Enter a number: ");
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let m: i32 = input.trim().parse().unwrap();
    
    println!("The factorial of {} is {}", m, fac(m));
}