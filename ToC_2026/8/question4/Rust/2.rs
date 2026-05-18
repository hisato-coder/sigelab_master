use std::io;

fn iszero(m: i32) -> bool { m == 0 }
fn pi(m: i32) -> i32 { if m == 0 { 0 } else { m - 1 } }

fn eq(m: i32, n: i32) -> bool {
    if iszero(m) {
        iszero(n)
    } else if iszero(n) {
        false
    } else {
        eq(pi(m), pi(n))
    }
}

fn main() {
    println!("Enter two numbers: ");
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let nums: Vec<i32> = input.split_whitespace().map(|s| s.parse().unwrap()).collect();
    
    if eq(nums[0], nums[1]) {
        println!("{} and {} are equal.", nums[0], nums[1]);
    } else {
        println!("{} and {} are not equal.", nums[0], nums[1]);
    }
}