export default function SectionCard({ title, children }) {
  return (
    <section className="glass-card section-card">
      <h2>{title}</h2>
      {children}
    </section>
  );
}
